package com.xcv58.leetcode.remove_sub_folders_from_the_filesystem;

import java.util.*;

public class Solution {

  class Folder {
    HashMap<String, Folder> subfolderMap = new HashMap<>();
    boolean touched = false;

    public void addPaths(String[] paths) {
      this.addPaths(paths, 0);
    }

    private void addPaths(String[] paths, int i) {
      String child = paths[i];
      Folder subfolder = subfolderMap.getOrDefault(child, new Folder());
      subfolderMap.put(child, subfolder);
      if (i + 1 == paths.length) {
        subfolder.touched = true;
      } else {
        subfolder.addPaths(paths, i + 1);
      }
    }

    private List<String> getTouchedPaths() {
      List<String> res = new ArrayList<>();
      for (String child : subfolderMap.keySet()) {
        Folder subfolder = subfolderMap.get(child);
        String prefix = "/" + child;
        if (subfolder.touched) {
          res.add(prefix);
        } else {
          for (String path : subfolder.getTouchedPaths()) {
            res.add(prefix + path);
          }
        }
      }
      return res;
    }
  }

  public List<String> removeSubfolders(String[] folder) {
    Folder root = new Folder();
    for (String f : folder) {
      root.addPaths(f.substring(1).split("/"));
    }
    return root.getTouchedPaths();
  }
}
