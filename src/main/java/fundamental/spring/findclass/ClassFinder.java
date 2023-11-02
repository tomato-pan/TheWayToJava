package fundamental.spring.findclass;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class ClassFinder {

    public static List<Class<?>> findClasses(String packageName) {
        List<Class<?>> classes = new ArrayList<>();
        String packagePath = packageName.replace(".", "/");
        URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        try {
            URL packageUrl = classLoader.findResources(packagePath).nextElement();
            if (packageUrl!=null){
                File packageDir = new File(packageUrl.toURI());
                classes = getClasses(packageDir,packageName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classes;
    }

    private static List<Class<?>> getClasses(File packageDir, String packageName) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<>();
        if (packageDir.exists()){
            File[] files = packageDir.listFiles();
            for (File file : files) {
                if (file.isDirectory()){
                    classes.addAll(getClasses(file,packageName+'.'+file.getName()));
                }else if (file.getName().endsWith(".class")){
                    String className = packageName+"."+file.getName().substring(0,file.getName().length()-6);
                    Class<?> clazz = loadClazz(className);
                    classes.add(clazz);
                }
            }
        }
        return classes;
    }

    private static Class<?> loadClazz(String className) throws ClassNotFoundException {
        return Class.forName(className);
    }

    public static void main(String[] args) {
        List<Class<?>> classes = ClassFinder.findClasses("fundamental.spring.findclass");
        System.out.println(classes);
        classes.stream().forEach(t-> {
            try {
                Object o = t.newInstance();
                System.out.println(o.toString());
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
