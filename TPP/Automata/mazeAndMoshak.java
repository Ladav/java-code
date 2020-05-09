/**
2) The Least-Recently-Used(LRU) cache algorithm exists the element from the cache(when it's full) that was least-recently-used. After an element is requested from the cache, it should be added to the cache(if not already there) and considered the most-recently-used element in the cache.
Given the maximum size of the cache and a list of integers(to request from the cache), calculate the number of cache misses using the LRU cache algorithm. A cache miss occur when the requested integer does not exist in the cache.
Initially, the cache is empty.
The input to the function LruCountMiss shall consist of an integer max_cache_size,  an array pages and its length len.
The function should return an integer for the number of cache misses using the LRU cache algorithm.
Assume that the array pages always has pages numbered from 1 to 50.
TESTCASES:
TESTCASE1:
INPUT:
3,[7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0],16
   7,0,1,2,0
     7,0,1,2
       7,0,1


EXPECTED RETURN VALUE:
11
TESTCASE 2:
INPUT:
2,[2,3,1,3,2,1,4,3,2],9

EXPECTED RETURN VALUE:
8
EXPLANATION:
The following page numbers are missed one after the other 2,3,1,2,1,4,3,2.This results in 8 page misses.
 */

import java.io.*;
import java.lang.*;

class Maze {
    int[] pages;
    int[] cache;

    Maze(int cacheSize, int[] pageArr, int totalPages) {
        pages = pageArr;
        cache = new int[cacheSize];
        for(int x = 0; x < cacheSize; x++) cache[x] = -1; // -1 represents empty cell
    }
    void push(int page, int length) {
        for(int x = length; x > 0; x--) {
            cache[x] = cache[x-1];
        }
        cache[0] = page;
    }
    boolean emptyCell(int page) {
        for(int x = 0; x < cache.length; x++) {
            if(cache[x] == -1) {    // if it is empty
                push(page, x);
                return true;
            }
        }
        return false;
    }
    boolean isAvail(int page) {
        for(int x = 0; x < cache.length; x++) {
            if(cache[x] == page) {
                push(page, x);
                cache[0] = page;
                return true;
            }
        }
        return false;
    }

    public int lruCountMiss() {
        int miss = 0;
        for(int a = 0; a < pages.length; a++) {
            // check for empty cell's
            if(emptyCell(pages[a])) {
                miss++;
                continue;
            }
            // when page is available in the cache
            if(isAvail(pages[a])) continue;

            push(pages[a], cache.length-1);
            miss++;
        }
        return miss;
    }

    public static void main(String la[]) {
        int pages[] = {2,3,1,3,2,1,4,3,2};
        int cache_size = 2;
        Maze m = new Maze(cache_size, pages, pages.length);
        int misses = m.lruCountMiss();
        System.out.println(misses);
    }
}