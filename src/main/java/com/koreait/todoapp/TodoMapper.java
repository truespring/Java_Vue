package com.koreait.todoapp;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.todoapp.model.TodoVO;

@Mapper
public interface TodoMapper {
	int insTodo(TodoVO param);
	List<TodoVO> selTodoList();
	int delTodo(TodoVO param);
}
