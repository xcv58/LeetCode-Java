package com.xcv58.leetcode.reconstruct_itinerary;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    private class Node<T> {
        T location;
        int index;
        Node(T l, int i) {
            location = l;
            index = i;
        }
        T get() {
            return location;
        }
    }

    public List<String> findItinerary(String[][] tickets) {
        int length = tickets.length;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String[] ticket : tickets) {
            String src = ticket[0];
            String dest = ticket[1];
            ArrayList<String> list = getList(map, src);
            list.add(dest);
        }
        map.values().forEach(Collections::sort);

        LinkedList<Node<String>> list = new LinkedList<>();
        String current = "JFK";
        list.add(new Node<>(current, -1));

        while (list.size() < length + 1) {
            ArrayList<String> tmpList = getList(map, current);
            if (tmpList.size() == 0) {
                for (int i = list.size() - 1; i > 0; i--) {
                    Node<String> node = list.get(i);
                    Node<String> preNode = list.get(i - 1);

                    current = preNode.get();
                    tmpList = map.get(current);
                    tmpList.add(node.index, node.location);

                    if (node.index + 1 < tmpList.size()) {
                        node.location = tmpList.get(node.index + 1);
                        tmpList.remove(node.index + 1);
                        node.index++;
                        current = node.location;
                        break;
                    } else {
                        list.remove(i);
                    }
                }
            } else {
                String next = tmpList.get(0);
                Node<String> node = new Node<>(next, 0);
                list.add(node);
                current = next;
                tmpList.remove(0);
            }
        }

        return list.stream().map(n -> n.location).collect(Collectors.toList());
    }

    private ArrayList<String> getList(HashMap<String, ArrayList<String>> map, String src) {
        ArrayList<String> list = map.get(src);
        if (list == null) {
            list = new ArrayList<>();
            map.put(src, list);
        }
        return list;
    }
}
