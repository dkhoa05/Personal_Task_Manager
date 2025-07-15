package src;

public class Task {

    private String id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String priority;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdatedAt;    
    
    public Task(String title, String description, LocalDate dueDate, String priority) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = "Chưa hoàn thành";
        this.createdAt = LocalDateTime.now();
        this.lastUpdatedAt = LocalDateTime.now();
    }

    public JSONObject toJSON() {
        JSONObject obj = new JSONObject();
        obj.put("id", id);
        obj.put("title", title);
        obj.put("description", description);
        obj.put("due_date", dueDate.toString());
        obj.put("priority", priority);
        obj.put("status", status);
        obj.put("created_at", createdAt.toString());
        obj.put("last_updated_at", lastUpdatedAt.toString());
        return obj;
    }
