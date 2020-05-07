package TestApp.SimpleConsoleAppFix;

import java.util.List;

import io.swagger.petstore.models.Category;
import io.swagger.petstore.models.StatusEnum;
import io.swagger.petstore.models.Tag;

public class PetModel {
	
	    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public StatusEnum getStatus() {
		return status;
	}
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	    Long id;
	    Category category;
	    String name;
	    List<String> photoUrls;
	    List<Tag> tags;
	    StatusEnum status;

}
