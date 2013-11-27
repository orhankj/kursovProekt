
public class route {
private float lenth;
private short daily;
private String nodes;
public route(float lenth, short daily, String nodes) {
	super();
	this.lenth = lenth;
	this.daily = daily;
	this.nodes = nodes;
}
@Override
public String toString() {
	return "route [lenth=" + lenth + ", daily=" + daily + ", nodes=" + nodes
			+ "]";
}
public float getLenth() {
	return lenth;
}
public void setLenth(float lenth) {
	this.lenth = lenth;
}
public short getDaily() {
	return daily;
}
public void setDaily(short daily) {
	this.daily = daily;
}
public String getNodes() {
	return nodes;
}
public void setNodes(String nodes) {
	this.nodes = nodes;
}

}
