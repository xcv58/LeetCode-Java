package com.xcv58.leetcode.number_of_music_playlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(1, solution.numMusicPlaylists(1, 1, 0));
    assertEquals(2, solution.numMusicPlaylists(2, 2, 0));
    assertEquals(2, solution.numMusicPlaylists(2, 2, 1));
    assertEquals(2, solution.numMusicPlaylists(2, 2, 0));
    assertEquals(6, solution.numMusicPlaylists(2, 3, 0));
    assertEquals(2, solution.numMusicPlaylists(2, 2, 1));
    assertEquals(0, solution.numMusicPlaylists(2, 2, 2));
    assertEquals(6, solution.numMusicPlaylists(3, 3, 0));
    assertEquals(6, solution.numMusicPlaylists(3, 3, 1));
    assertEquals(6, solution.numMusicPlaylists(3, 3, 2));
    assertEquals(0, solution.numMusicPlaylists(3, 3, 3));
    assertEquals(36, solution.numMusicPlaylists(3, 4, 0));
    assertEquals(150, solution.numMusicPlaylists(3, 5, 0));
    assertEquals(540, solution.numMusicPlaylists(3, 6, 0));
    assertEquals(6, solution.numMusicPlaylists(3, 6, 2));
    assertEquals(0, solution.numMusicPlaylists(3, 6, 3));
    assertEquals(368644030, solution.numMusicPlaylists(20, 30, 3));
    assertEquals(547728747, solution.numMusicPlaylists(20, 30000, 5));
  }
}
