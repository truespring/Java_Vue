package com.koreait.todoapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.koreait.todoapp.model.TodoVO;

@RestController
@RequestMapping("/api")
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@RequestMapping(value="/insTodo", method=RequestMethod.POST)
	public int insTodo(@RequestBody TodoVO param) {
//		System.out.println("insTodo");
		return service.insTodo(param);
	}
	
	@RequestMapping("/selTodoList")
	public List<TodoVO> selTodoList() {
		return service.selTodoList();
	}
	
	@RequestMapping(value="/delTodo", method=RequestMethod.DELETE)
	public int delTodo(TodoVO param) {
//		System.out.println(param.getI_todo());
		return service.delTodo(param);
	}
}
