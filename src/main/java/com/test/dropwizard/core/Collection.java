package com.test.dropwizard.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
	
	private int contentId;
	
	private String collectionType;

	private String narrationLink;

	private String notes;

	private String keyPoints;

	private String language;

	private String estimatedTime;

	private Set<CollectionItem> collectionItems;

	private List<User> collaborators;

	private String network;

	private CollectionItem collectionItem;

	private Short buildTypeId;

	private Short publishStatusId;

	private Boolean mailNotification;

	private Map<String, Object> lastModifiedUser;

	private String ideas;

	private String questions;

	private String performanceTasks;

	private String languageObjective;

	private List<Integer> audienceIds;

	private Integer itemCount;

	private String collectionItemId;

	private String clusterUid;

	private Integer isRepresentative;

	private String title;

	private String description;

	private String grade;

	private String copiedCollectionId;

	private Integer position;

	private String url;

	private String imagePath;

	private List<Integer> taxonomyCourseIds;

	private List<Integer> subdomainIds;

	private List<Integer> depthOfKnowledgeIds;
	
	private Short distinguish;

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}

	public String getNarrationLink() {
		return narrationLink;
	}

	public void setNarrationLink(String narrationLink) {
		this.narrationLink = narrationLink;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getKeyPoints() {
		return keyPoints;
	}

	public void setKeyPoints(String keyPoints) {
		this.keyPoints = keyPoints;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public Set<CollectionItem> getCollectionItems() {
		return collectionItems;
	}

	public void setCollectionItems(Set<CollectionItem> collectionItems) {
		this.collectionItems = collectionItems;
	}

	public List<User> getCollaborators() {
		return collaborators;
	}

	public void setCollaborators(List<User> collaborators) {
		this.collaborators = collaborators;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public CollectionItem getCollectionItem() {
		return collectionItem;
	}

	public void setCollectionItem(CollectionItem collectionItem) {
		this.collectionItem = collectionItem;
	}

	public Short getBuildTypeId() {
		return buildTypeId;
	}

	public void setBuildTypeId(Short buildTypeId) {
		this.buildTypeId = buildTypeId;
	}

	public Short getPublishStatusId() {
		return publishStatusId;
	}

	public void setPublishStatusId(Short publishStatusId) {
		this.publishStatusId = publishStatusId;
	}

	public Boolean getMailNotification() {
		return mailNotification;
	}

	public void setMailNotification(Boolean mailNotification) {
		this.mailNotification = mailNotification;
	}

	public Map<String, Object> getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setLastModifiedUser(Map<String, Object> lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public String getIdeas() {
		return ideas;
	}

	public void setIdeas(String ideas) {
		this.ideas = ideas;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getPerformanceTasks() {
		return performanceTasks;
	}

	public void setPerformanceTasks(String performanceTasks) {
		this.performanceTasks = performanceTasks;
	}

	public String getLanguageObjective() {
		return languageObjective;
	}

	public void setLanguageObjective(String languageObjective) {
		this.languageObjective = languageObjective;
	}

	public List<Integer> getAudienceIds() {
		return audienceIds;
	}

	public void setAudienceIds(List<Integer> audienceIds) {
		this.audienceIds = audienceIds;
	}

	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public String getCollectionItemId() {
		return collectionItemId;
	}

	public void setCollectionItemId(String collectionItemId) {
		this.collectionItemId = collectionItemId;
	}

	public String getClusterUid() {
		return clusterUid;
	}

	public void setClusterUid(String clusterUid) {
		this.clusterUid = clusterUid;
	}

	public Integer getIsRepresentative() {
		return isRepresentative;
	}

	public void setIsRepresentative(Integer isRepresentative) {
		this.isRepresentative = isRepresentative;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCopiedCollectionId() {
		return copiedCollectionId;
	}

	public void setCopiedCollectionId(String copiedCollectionId) {
		this.copiedCollectionId = copiedCollectionId;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public List<Integer> getTaxonomyCourseIds() {
		return taxonomyCourseIds;
	}

	public void setTaxonomyCourseIds(List<Integer> taxonomyCourseIds) {
		this.taxonomyCourseIds = taxonomyCourseIds;
	}

	public List<Integer> getSubdomainIds() {
		return subdomainIds;
	}

	public void setSubdomainIds(List<Integer> subdomainIds) {
		this.subdomainIds = subdomainIds;
	}

	public List<Integer> getDepthOfKnowledgeIds() {
		return depthOfKnowledgeIds;
	}

	public void setDepthOfKnowledgeIds(List<Integer> depthOfKnowledgeIds) {
		this.depthOfKnowledgeIds = depthOfKnowledgeIds;
	}

	public Short getDistinguish() {
		return distinguish;
	}

	public void setDistinguish(Short distinguish) {
		this.distinguish = distinguish;
	}	


}
