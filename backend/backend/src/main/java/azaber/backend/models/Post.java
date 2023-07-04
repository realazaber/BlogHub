package azaber.backend.models;

import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    private int postId;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public int getPostId() {
        return this.postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}