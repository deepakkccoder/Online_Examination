package edu.mum.onlinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import edu.mum.onlinetest.model.Category;
import edu.mum.onlinetest.model.SubCategory;
import edu.mum.onlinetest.service.CategoryServiceInterface;
import edu.mum.onlinetest.service.SubCategoryInterface;

@Controller
@RequestMapping("/subcategories")
public class SubCategoryController {

	@Autowired
	SubCategoryInterface subCategoryService;

	@Autowired
	CategoryServiceInterface categoryService;

	// Get all Category------

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<SubCategory>> getAll() {
		/* LOG.info("getting all categories"); */
		List<SubCategory> subcategories = subCategoryService.getAllSubCategory();

		subcategories.forEach(s -> {
			System.out.println(s);
		});

		return new ResponseEntity<List<SubCategory>>(subcategories, HttpStatus.OK);
	}

	// Get category by ID------

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<SubCategory> get(@PathVariable("id") Long id) {

		SubCategory subCategory = subCategoryService.getSubCategoryByID(id);

		return new ResponseEntity<SubCategory>(subCategory, HttpStatus.OK);
	}

	// Add category ------

	/*
	 * @RequestMapping(method = RequestMethod.POST) public ResponseEntity<Void>
	 * create(@RequestBody SubCategory subCategory, UriComponentsBuilder
	 * ucBuilder){
	 * 
	 * subCategory.setCategory(categoryService.getCategoryByID((long) 8));
	 * 
	 * subCategoryService.saveSubCategory(subCategory); HttpHeaders headers =
	 * new HttpHeaders(); return new ResponseEntity<Void>(headers,
	 * HttpStatus.CREATED); }
	 */

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addSubcategory(@ModelAttribute("subCategory") SubCategory subCategory, Model model) {
		List<Category> listOfCategory = categoryService.getAllCategory();
		model.addAttribute("listOfCategory", listOfCategory);
		//model.addAttribute("subCategory", new SubCategory());
		return "add_subcategory";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String create(@ModelAttribute("subCategory") SubCategory subCategory, BindingResult result) {

		subCategory.setCategory(categoryService.getCategoryByID(subCategory.getCategory().getId()));
System.out.println("=============================SubCategoryController====================");
		subCategoryService.saveSubCategory(subCategory);
		return "redirect:/subcategories/add";
	}
}
