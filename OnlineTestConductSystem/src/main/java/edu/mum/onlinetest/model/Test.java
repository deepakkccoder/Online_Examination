package edu.mum.onlinetest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Test {
	@javax.persistence.Id
	@GeneratedValue
	private int id;
	
	//@OneToMany(fetch = FetchType.EAGER, mappedBy = "topic", cascade = CascadeType.ALL)
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<SubCategory> subCategories;
	@OneToOne
	private Category category;
	
	
	@OneToOne
	private AnswerSheet answersheet;
	@OneToMany
	private List<Question>questionList;
	public List<Question> getQuestionList() {
		return questionList;
	}
	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
	public AnswerSheet getAnswersheet() {
		return answersheet;
	}
	public void setAnswersheet(AnswerSheet answersheet) {
		this.answersheet = answersheet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
