package fundamental.designMode.combineMode.service.engine;

import fundamental.designMode.combineMode.model.aggregates.TreeRich;
import fundamental.designMode.combineMode.model.vo.EngineResult;
import fundamental.designMode.combineMode.model.vo.TreeNode;
import fundamental.designMode.combineMode.model.vo.TreeRoot;
import fundamental.designMode.combineMode.service.logic.LogicFilter;

import java.util.Map;

public abstract class EngineBase extends EngineConfig implements IEngine {

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        //节点类型[NodeType]；1子叶、2果实
        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            System.out.println("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}"+ treeRoot.getTreeName()+ userId+ treeId+treeNodeInfo.getTreeNodeId()+ruleKey+matterValue);
        }
        return treeNodeInfo;
    }

}