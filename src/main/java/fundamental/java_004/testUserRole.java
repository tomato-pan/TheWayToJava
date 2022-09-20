package fundamental.java_004;

import java.util.EnumSet;

public class testUserRole {
    public static void main(String[] args) {
        EnumSet<UserRole> userRoleEnumSet = EnumSet.of(UserRole.ROLE_ROOT_ADMIN,
                UserRole.ROLE_ORDER_ADMIN);

        UserRole role1 = UserRole.ROLE_ROOT_ADMIN;
        UserRole role2 = UserRole.ROLE_ORDER_ADMIN;
        UserRole role3 = UserRole.ROLE_NORMAL;
        if (userRoleEnumSet.contains(role3)){
            System.out.println(111);
        }
        else{
            System.out.println("不再里面！！");
        }
        for (UserRole ur : UserRole.values()){
            System.out.println(ur);
        }
        // ordinal()方法：返回枚举常量的序数，注意从0开始
        System.out.println( role1.ordinal() ); // 打印0
        System.out.println( role2.ordinal() ); // 打印1
        System.out.println( role3.ordinal() ); // 打印2

        // compareTo()方法：枚举常量间的比较
        System.out.println( role1.compareTo(role2) ); //打印-1
        System.out.println( role2.compareTo(role3) ); //打印-2
        System.out.println( role1.compareTo(role3) ); //打印-2

        // name()方法：获得枚举常量的名称
        System.out.println( role1.name() ); // 打印ROLE_ROOT_ADMIN
        System.out.println( role2.name() ); // 打印ROLE_ORDER_ADMIN
        System.out.println( role3.name() ); // 打印ROLE_NORMAL

        // valueOf()方法：返回指定名称的枚举常量
        System.out.println( UserRole.valueOf( "ROLE_ROOT_ADMIN" ) );
        System.out.println( UserRole.valueOf( "ROLE_ORDER_ADMIN" ) );
        System.out.println( UserRole.valueOf( "ROLE_NORMAL" ) );
    }
}
