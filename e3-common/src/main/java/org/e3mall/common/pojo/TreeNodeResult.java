package org.e3mall.common.pojo;

import java.io.Serializable;

public class TreeNodeResult implements Serializable {

	// 节点Id;
	private Long id;
	// 节点文本
	private String text;
	// 节点状态"open"或"closed"
	private String state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
