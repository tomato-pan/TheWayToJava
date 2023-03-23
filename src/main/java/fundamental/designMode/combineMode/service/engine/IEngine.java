package fundamental.designMode.combineMode.service.engine;

import fundamental.designMode.combineMode.model.aggregates.TreeRich;
import fundamental.designMode.combineMode.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
