package com.yuntong.common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mylover on 7/27/15.
 * @param <T>
 */
public class PageModel<T> implements Serializable {
    private int number;
    private int size;
    private int totalPages;
    private int numberOfElements;
    private long totalElements;
    private List<T> pageInfo;

    public int getNumber() {
        return number;
    }

    public List<T> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(List<T> pageInfo) {
		this.pageInfo = pageInfo;
	}

	public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }
}
