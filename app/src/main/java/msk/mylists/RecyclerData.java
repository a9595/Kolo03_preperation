package msk.mylists;

public class RecyclerData {

    private String text;
    private String description;
    private String imageUrl;

    public RecyclerData(String text, String description, String imageUrl) {
        this.text = text;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getRecyclerItemText() {
        return text;
    }

    public String getRecyclerItemDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
