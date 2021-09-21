package com.example.api;

import com.example.entity.Todo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*

    How to map request to handler-methods ?

    => by path
    => by http-method
    => by presence /absence of params   + values
    => by presence / absence of http-headers
    => by request/response payload



 */

@RestController
public class TodoController {

    @RequestMapping(value = "/api/todos",method = RequestMethod.POST,consumes = {"application/json"},produces = {"application/json"})
    public @ResponseBody ResponseEntity<?> createTodo(@RequestBody Todo todo){
        System.out.println(todo);
        return ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(todo);
    }

    @RequestMapping(value = "/api/todos",method = RequestMethod.GET,params = {"type"},headers = {"Tavant-Header"})
    public @ResponseBody ResponseEntity<?> getAllTodos(@RequestParam String type){
        System.out.println(type);
        List<Todo> todos=List.of(new Todo(1,"todo-1",false),new Todo(2,"todo-2",false));
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(todos);
    }


    @GetMapping("/api/todos/{id}")
    public Todo getTodo(@PathVariable int id){
        if(id==13){
         throw new ResourceNotFoundEception("todo not exist");
        }
        return new Todo(id,"todo-?",true);
    }


    //---------------------------------------------------------------------------------------------------------



//
//    @GetMapping("/x")
//    public String doX(){
//        System.out.println("doX()");
//        return "view-name";
//    }


    //---------------------------------------------------------------------------------------------------------

    // Possible Arguments for Spring MVC handler methods

    //
    //    @GetMapping("/x/{id}")
    //    public String doX(Principal principal,
    //                      HttpServletRequest request,
    //                      HttpServletResponse response,
    //                      HttpSession session,
    ////                      @ModelAttribute Todo todo
    ////                      @RequestBody Todo todo,
    ////                      BindingResult result,
    ////                      @RequestParam(name = "p1",required = false) String param1
    ////                      @RequestHeader(name = "some-header") String headerValue
    ////                      @CookieValue(name = "cokkie1") String cookieValue,
    ////                      @PathVariable(name="id") int id
    ////                      @MatrixVariable int q,
    ////                      Model model,
    //                        Map<String,String> model
    //                      ){
    //        System.out.println("doX()");
    //        return "response-body";
    //    }





}
