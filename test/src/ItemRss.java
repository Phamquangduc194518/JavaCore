public class ItemRss {
    private String title;
    private String description;
    private String linkImage;
    private String linkHtml;
    private String datePublic;

    public ItemRss(String title, String description, String linkImage, String linkHtml, String datePublic) {
        this.title = title;
        this.description = description;
        this.linkImage = linkImage;
        this.linkHtml = linkHtml;
        this.datePublic = datePublic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getLinkHtml() {
        return linkHtml;
    }

    public void setLinkHtml(String linkHtml) {
        this.linkHtml = linkHtml;
    }

    public String getDatePublic() {
        return datePublic;
    }

    public void setDatePublic(String datePublic) {
        this.datePublic = datePublic;
    }

    public void printfIfo(){
        System.out.println("title: "+ title);
        System.out.println("description: "+ description);
        System.out.println("imageLink: "+ linkImage);
        System.out.println("htmlLink: "+ linkHtml);
        System.out.println("datePublic: "+ datePublic);
        System.out.println("====================================");
    }
}
