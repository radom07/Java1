public enum OrderStatus {
    NEW, PROCESSING, SHIPPED, DELIVERED, CANCELED;

    public boolean isActive() {
        return this != CANCELED && this != DELIVERED;
    }
}
