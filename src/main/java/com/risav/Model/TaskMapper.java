package com.risav.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

public class TaskMapper implements RowMapper<ToDoListModel> {

  @SuppressWarnings("null")
  @Override
  @Nullable
  public ToDoListModel mapRow(ResultSet rs, int rowNum) throws SQLException {
    return new ToDoListModel(
      rs.getInt("id"), 
      rs.getString("title"), 
      rs.getString("description"), 
      rs.getBoolean("completed"));
  }
}
