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

    // _linkID를 linkID로 가지는 link반환
    public Link getLink (int _linkID) {
        for (Link currLink : linkArrayList) {
            if (currLink.getLinkID() == _linkID) {
                return currLink;
            }
        }
        // 탐색에 실패한 경우 nodeId가 -1인 Link반환
        return new Link(-1,-1,-1,(double)-1);
    }

    // testNo에 맞게 경로 Point로 생성하는 작업
    // 아직  startNode가 닿는지 endNode가 닿는지에 따라 순서대로/역순으로 나오는 로직은 추가 안함
    public ArrayList<Point> routePoints (int testNo) {
        ArrayList<Point> routePoints = new ArrayList<>();
        if (testNo == 1) {
            // node0 에서 node 55로 가는 경로
            // link route : 0->3->20->22->25->41->58->74->89->91->93->96
            routePoints.addAll(getLink(0).getInvolvingPointList());
            routePoints.addAll(getLink(3).getInvolvingPointList());
            routePoints.addAll(getLink(20).getInvolvingPointList());
            routePoints.addAll(getLink(22).getInvolvingPointList());
            routePoints.addAll(getLink(25).getInvolvingPointList());
            routePoints.addAll(getLink(41).getInvolvingPointList());
            routePoints.addAll(getLink(58).getInvolvingPointList());
            routePoints.addAll(getLink(74).getInvolvingPointList());
            routePoints.addAll(getLink(89).getInvolvingPointList());
            routePoints.addAll(getLink(91).getInvolvingPointList());
            routePoints.addAll(getLink(93).getInvolvingPointList());
            routePoints.addAll(getLink(96).getInvolvingPointList());
        } else if (testNo == 2) {
            // node0 에서 node 55로 가는 경로
            // link route : 0->3->13->23->27->36->46->48->52->58
            routePoints.addAll(getLink(0).getInvolvingPointList());

            routePoints.addAll(getLink(3).getInvolvingPointList());
            System.out.println(getLink(3).getInvolvingPointList());
            routePoints.addAll(getLink(13).getInvolvingPointList());
            routePoints.addAll(getLink(23).getInvolvingPointList());
            routePoints.addAll(getLink(27).getInvolvingPointList());
            routePoints.addAll(getLink(36).getInvolvingPointList());
            routePoints.addAll(getLink(46).getInvolvingPointList());
            routePoints.addAll(getLink(48).getInvolvingPointList());
            routePoints.addAll(getLink(52).getInvolvingPointList());
            routePoints.addAll(getLink(58).getInvolvingPointList());
        } else if (testNo == 3) {

        } return routePoints;
    }
}


