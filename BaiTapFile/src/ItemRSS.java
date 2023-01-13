public class ItemRSS {
    private String title, summary, linkImage, linkHtml, date;

    public ItemRSS(String title, String summary, String linkImage, String linkHtml, String date) {
        this.title = title;
        this.summary= summary;
        this.linkImage = linkImage;
        this.linkHtml = linkHtml;
        this.date = date;
    }

    public ItemRSS(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String printInfo(){
        return "Tiêu đề:"+title.trim()+"\n"+"Tóm lược::"+summary.trim()+"\n"+
                "Link ảnh:"+linkImage.trim()+"\n"+"Link html:"+linkHtml.trim()+"\n"+
                "Ngày tháng:"+date.trim()+"\n"+"\n"+"--------------------------------";
    }
}
