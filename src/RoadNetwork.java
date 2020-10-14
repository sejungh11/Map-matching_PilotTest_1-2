import sun.management.AgentConfigurationError;

import java.util.ArrayList;

public class RoadNetwork {

    // 데이터를 보관할 ArrayList들을 담는 class..
    // 필요 없을 수도 있지만 혹시의 상황을 대비해서 만들었음
    // 일단 이런 구조로 ArrayList로 선언해보고 이 클래스 정 필요 없겠다 싶으면 다음 테스트에서 다시 파기 예정
    // 만약 필요하게 되면 private으로 만들어주고 getter setter만들 예정
    protected ArrayList<Node> nodeArrayList = new ArrayList<>();
    protected ArrayList<Link> linkArrayList = new ArrayList<>();

    // _nodeID를 nodeID로 가지는 node반환
    public Node getNode (int _nodeID) {
        for (Node currNode : nodeArrayList) {
            if (currNode.getNodeID() == _nodeID) {
                return currNode;
            }
        }
        // 탐색에 실패한 경우 nodeId가 -1인 Node반환
        return new Node(-1, new Point((double)-99,(double)-99));
    }

    // testNo에 맞게 경로 Point로 생성하는 작업
    // 아직  startNode가 닿는지 endNode가 닿는지에 따라 순서대로/역순으로 나오는 로직은 추가 안함
    public ArrayList<Point> routePoints (int testNo) {
        ArrayList<Point> routePoints = new ArrayList<>();
        if (testNo == 1) {
            // node0 에서 node 55로 가는 경로
            // link route : 0->3->20->22->25->41->58->74->89->91->93->96
            routePoints.addAll(linkArrayList.get(0).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(3).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(20).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(22).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(25).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(41).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(58).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(74).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(89).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(91).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(93).getInvolvingPointList());
            routePoints.addAll(linkArrayList.get(96).getInvolvingPointList());
            return routePoints;
        } else if (testNo == 2) {

        } else if (testNo == 3) {

        } return routePoints;
    }
}


