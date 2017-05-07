package edu.mum.onlinetest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UriComponentsBuilder;

import edu.mum.onlinetest.model.Category;
import edu.mum.onlinetest.model.Student;
import edu.mum.onlinetest.model.SubCategory;
import edu.mum.onlinetest.service.CategoryServiceInterface;
import edu.mum.onlinetest.service.StudentServiceInterface;
import edu.mum.onlinetest.service.SubCategoryInterface;
import edu.mum.onlinetest.serviceImpl.StudentServiceImpl;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentServiceInterface studentService;
	
	@Autowired
    CategoryServiceInterface categoryService;
	
	@Autowired
    SubCategoryInterface subCategoryService;
	
	@Autowired
	StudentServiceImpl studentServiceImpl;

	@RequestMapping(value = "/studentExamLogin", method = RequestMethod.GET)
	public String studentExamLogin() {
		return "stu_login";
	}

	
	@RequestMapping(value = "/studentExamSelection", method = RequestMethod.POST)
	public String studentCategorySubCategorySection(/*@PathVariable("id") Long id*/ HttpServletRequest request, Model model) {
		List<Student> students = studentServiceImpl.getAllStudent();
		for(int i=0 ; i< students.size(); i++){
			String accessID = students.get(i).getAccessCode();
			
		/*String accessID = "abcdef";
		String gotAccessID = (String) request.getParameter("accessCode");
		System.out.println(gotAccessID);*/
			
			if( accessID.equals((String) request.getParameter("accessCode"))){
				List<Category> listOfCategories = categoryService.getAllCategory();
				//List<SubCategory> listOfSubCategories = subCategoryService.getSubCategoryByID(id);
				List<SubCategory> listOfSubCategories = subCategoryService.getAllSubCategory();
				model.addAttribute("listOfCategories", listOfCategories);
				model.addAttribute("listOfSubcategories", listOfSubCategories);
				return "stu_sel_exam";
			}
		}
		
		return "stu_login";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getAll(Model model) {
		/* LOG.info("getting all students"); */
		model.addAttribute("listOfStudents", studentService.getAllStudent());
		// List<Student> students = studentService.getAllStudent();

		/*
		 * if (students == null || students.isEmpty()){
		 * LOG.info("no student found"); return new
		 * ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT); }
		 */

		// return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
		return "coach_home_page";
	}

	// Get student by ID------

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<Student> get(@PathVariable("id") Long id) {

		Student student = studentService.getStudentByID(id);

		/*
		 * if (user == null){ LOG.info("student with id {} not found", id);
		 * return new ResponseEntity<User>(HttpStatus.NOT_FOUND); }
		 */

		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	// Add student ------

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Student student, UriComponentsBuilder ucBuilder) {
		studentService.saveStudent(student);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	// Update existing student-----

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
		// LOG.info("updating student: {}", employee);
		Student currentStudent = studentService.getStudentByID(id);

		/*
		 * if (currentStudent == null){ LOG.info("Student with id {} not found",
		 * id); return new ResponseEntity<User>(HttpStatus.NOT_FOUND); }
		 */

		studentService.saveStudent(currentStudent);
		return new ResponseEntity<Student>(currentStudent, HttpStatus.OK);
	}

	// Delete student -----

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") Long id, RedirectAttributes rm) {
		// LOG.info("deleting student with id: {}", id);
		// Student student = studentService.getStudentByID(id);

		/*
		 * if (student == null){ //
		 * LOG.info("Unable to delete. Student with id {} not found", id);
		 * 
		 * return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); }
		 */

		System.out.println("here im");

		rm.addFlashAttribute("studentDeleteMessage", "Student has been successfully deleted!");
		studentService.deleteStudentByID(id);
		// return new ResponseEntity<Void>(HttpStatus.OK);
		return "redirect:/coach/studentList";
	}

}
