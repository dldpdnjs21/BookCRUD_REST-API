package com.ureca.book.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ureca.book.dto.Book;

@Mapper
public interface BookDAO {
    public int insert(Book book)throws SQLException;
    public int update(Book book)throws SQLException;
    public int delete(String isbn)throws SQLException;

    public List<Book> selectAll()throws SQLException;
    public Book select(String isbn)throws SQLException;
}
