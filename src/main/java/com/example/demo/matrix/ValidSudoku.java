package com.example.demo.matrix;

import java.io.CharArrayReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import ch.qos.logback.core.net.SyslogOutputStream;

public class ValidSudoku {
  public boolean isValidSudoku(char[][] board) {
    return isValid3x3Matrix(board);
  }

  public boolean isValid3x3Matrix(char[][] board) {
    for (int i = 0; i < 9; i++) {
      char[] row = board[i];
      char[] col = new char[9];

      for(int j = 0; j < 9; j++) {
        col[j] = board[j][i];
      }
      if(!checkIfValid_WithStreams(row) || !checkIfValid_WithStreams(col)) {
        return false;
      }

      if (i % 3 == 0) {
        if(!checkIfValid3x3Matrix(board, i)) {
          return false;
        }
      }
    }

    return true;

  }

  private boolean checkIfValid3x3Matrix(char[][] board, int row) {
    HashMap<Character, Integer> acc = new HashMap<>();

    for (int mat = 0; mat < 3; mat++) {
      for (int k = row; k < row + 3; k++) {
        for (int j = mat * 3; j < mat * 3 + 3; j++) {
          char c = board[k][j];
          if (c == '.')
            continue;
          if (acc.containsKey(c)) {
            return false;
          }
          else {
            acc.put(c, 1);
          }
        }
      }
      acc.clear();
    }

    return true;
  }

  private boolean checkIfValid(char[] row) {
    HashMap<Character, Integer> acc = new HashMap<>();

    for(int i = 0; i < 9; i++) {
      if (row[i] == '.') continue;
      if (acc.containsKey(row[i])) {
        return false;
      } else {
        acc.put(row[i], 1);
      }
    }

    return true;
  }

  private boolean checkIfValid_WithStreams(char[] row) {
    Stream<Character> characterStream = IntStream.range(0, row.length).mapToObj(idx -> row[idx]);
    HashMap<Character, Integer> res = characterStream.filter(e -> Character.isDigit(e)).collect(HashMap::new, (map, e) -> {
      if (!map.containsKey(e)) {
        map.put(e, 1);
      }
      else {
        map.put(e, map.get(e) + 1);
      }
    }, HashMap::putAll);
    for (Map.Entry<Character, Integer> entry : res.entrySet()) {
      if (entry.getValue() > 1) {
        return false;
      }
    }
    return true;


  }

}
