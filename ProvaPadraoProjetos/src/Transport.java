public interface Transport {
    boolean isApplicable(Package pkg, Location location);
    void deliver(Package pkg);
}
