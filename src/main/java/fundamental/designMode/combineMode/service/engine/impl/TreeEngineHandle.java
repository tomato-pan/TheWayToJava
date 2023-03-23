package fundamental.designMode.combineMode.service.engine.impl;

import fundamental.designMode.combineMode.model.aggregates.TreeRich;
import fundamental.designMode.combineMode.model.vo.EngineResult;
import fundamental.designMode.combineMode.model.vo.TreeNode;
import fundamental.designMode.combineMode.service.engine.EngineBase;

import java.util.Map;

public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
