package com.xcv58.leetcode.reconstruct_itinerary;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test public void test() {
        assertArrayEquals(
                new String[]{"JFK", "MUC", "LHR", "SFO", "SJC"},
                this.getResult(
                        new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}}
                )
        );
        assertArrayEquals(
                new String[]{"JFK","ATL","JFK","SFO","ATL","SFO"},
                this.getResult(
                        new String[][]{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}}
                )
        );
        assertArrayEquals(
                new String[]{"JFK","SFO","JFK","SFO","JFK","ABC"},
                this.getResult(
                        new String[][]{{"JFK","SFO"},{"SFO","JFK"},{"JFK","SFO"},{"SFO","JFK"},{"JFK","ABC"}}
                )
        );
        assertArrayEquals(
                new String[]{"JFK","SFO","JFK","SFO","JFK","ABC"},
                this.getResult(
                        new String[][]{{"JFK","SFO"},{"SFO","JFK"},{"JFK","SFO"},{"SFO","JFK"},{"JFK","ABC"}}
                )
        );
        assertArrayEquals(
                new String[]{"JFK","BBB","JFK","ZZZ","YYY","XXX","JFK","AAA"},
                this.getResult(
                        new String[][]{{"JFK","ZZZ"},{"ZZZ","YYY"},{"YYY","XXX"},{"XXX","JFK"},{"JFK","BBB"},{"BBB","JFK"},{"JFK","AAA"}}
                )
        );
        assertArrayEquals(
                new String[]{
                        "JFK",
                        "ZZZ",
                        "YYY",
                        "XXX",
                        "BBB",
                        "JFK",
                        "AAA"
                },
        this.getResult(
                        new String[][]{
                                {"JFK","ZZZ"},
                                {"ZZZ","YYY"},
                                {"YYY","XXX"},
                                {"XXX","BBB"},
                                {"BBB","JFK"},
                                {"JFK","AAA"}
                        }
                )
        );
        assertArrayEquals(
                new String[]{
                        "JFK",
                        "BBB",
                        "JFK",
                        "ZZZ",
                        "BBB",
                        "ZZZ",
                        "YYY",
                        "XXX",
                        "BBB",
                        "JFK",
                        "AAA"
                },
                this.getResult(
                        new String[][]{
                                {"JFK","ZZZ"},
                                {"ZZZ","BBB"},
                                {"BBB","ZZZ"},
                                {"ZZZ","YYY"},
                                {"YYY","XXX"},
                                {"XXX","BBB"},
                                {"BBB","JFK"},
                                {"JFK","BBB"},
                                {"BBB","JFK"},
                                {"JFK","AAA"}
                        }
                )
        );
    }

    private String[] getResult(String[][] tickets) {
        Solution solution = new Solution();
        List<String> itinerary = solution.findItinerary(tickets);
        return itinerary.toArray(new String[itinerary.size()]);

    }
}