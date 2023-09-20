package org.example.controller;

import org.example.entity.ClassesVO;
import org.example.entity.StudentVO;
import org.example.repository.ClassesRepository;
import org.example.request.StudentRequest;
import org.example.service.ClassService;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private ClassesRepository classesRepository;
    @Autowired
    private ClassService classService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String load(){

        return ("Welcome To Demo");
    }

    @GetMapping("/admin")
    public String admin(){

        return ("Welcome To Demo Admin");
    }
    @GetMapping("/user/index")
    public String user(){

        return ("Welcome To Demo User");
    }

//
//    @PostMapping("/insert")
//    public ResponseEntity<StudentVO> insertStudent(@RequestBody StudentRequest studentRequest) {
//
//        StudentVO studentVO = new StudentVO(studentRequest);
//        studentService.insertStudent(studentVO);
//        for (String s : studentRequest.getClasses()){
//            ClassesVO classesVO = new ClassesVO();
//            classesVO.setStudentVO(studentVO);
//            classesVO.setClassName(s);
//            classesRepository.save(classesVO);
//        }
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//
//    @GetMapping("/seeStudents")
//    public List<StudentVO> seeStudents() {
//        return studentService.getStudents();
//    }
//
//    @GetMapping("{id}")
//    public ResponseEntity<StudentVO> getStudentById(@PathVariable("id") int studentId) {
//        return new ResponseEntity<StudentVO>(studentService.getStudentById(studentId), HttpStatus.OK);
//    }
//
//    @PutMapping("{id}")
//    public ResponseEntity<StudentVO> updateStudent(@PathVariable("id") int studentId, @RequestBody StudentVO studentVO) {
//        return new ResponseEntity<StudentVO>(studentService.editStudent(studentVO, studentId), HttpStatus.OK);
//    }
//
//    @DeleteMapping("{id}")
//    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId) {
//        studentService.deleteStudent(studentId);
//        return new ResponseEntity<String>("Bye Bye", HttpStatus.OK);
//
//    }
//
////    @GetMapping("/findByFirstName")
////    public ResponseEntity<List<StudentVO>> getStudentByFirstName(@RequestParam String firstName) {
////        return new ResponseEntity<List<StudentVO>>(studentService.getStudentFirstName(firstName), HttpStatus.OK);
////    }
//
//    @GetMapping("/findByFirstName")
//    public ResponseEntity<List<StudentVO>> getStudentByFirstName(@RequestParam int id) {
//        return new ResponseEntity<List<StudentVO>>(studentService.findById(id), HttpStatus.OK);
//    }
//    @GetMapping("/findByFirstNameAndLastName")
//    public ResponseEntity<List<StudentVO>> getStudentByFirstNameAndLastName(@RequestParam String firstName, @RequestParam String name) {
//        return new ResponseEntity<List<StudentVO>>(studentService.getStudentFirstNameAndLastName(firstName, name), HttpStatus.OK);
//    }
//
//    @GetMapping("/findByFirstNameLike")
//    public ResponseEntity<List<StudentVO>> getStudentByFirstNameLike(@RequestParam String firstName) {
//        return new ResponseEntity<List<StudentVO>>(studentService.findByFirstNameContaining(firstName), HttpStatus.OK);
//    }
//
//    @GetMapping("/getUsingFirstNameOrLastName")
//    public ResponseEntity<List<StudentVO>> getStudentByFirstNameOrLastName(@RequestParam String firstName, @RequestParam String lastName) {
//        return new ResponseEntity<List<StudentVO>>(studentService.getStudentsByFirstNameOrLastName(firstName, lastName), HttpStatus.OK);
//    }
//
////    @GetMapping("/getClasses")
////    public ResponseEntity<List<StudentVO>> getClasses(@RequestParam String classes){
////        System.out.println("in getClasses");
////        return new ResponseEntity<List<StudentVO>>(studentService.findByClassesVO_ClassName(classes),HttpStatus.OK);
////    }
////
////    @GetMapping("/getClass")
////    public ResponseEntity<List<StudentVO>> getClass(@RequestParam String className){
////        return new ResponseEntity<List<StudentVO>>(studentService.getByClassName(className),HttpStatus.OK);
////    }
//
//    @GetMapping("/getClassesByStudentFirstName")
//    public ResponseEntity<List<ClassesVO>> getClassesByStudentFirstName(@RequestParam String firstName){
//        return new ResponseEntity<List<ClassesVO>>(classService.findByStudentVO_FirstName(firstName),HttpStatus.OK);
//    }
}
