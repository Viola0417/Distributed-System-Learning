package cluster.Management;

public interface OnElectionCallback {

    void onElectedToBeLeader();

    void onWorker();

}
