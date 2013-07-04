/*
    Copyright 2005, 2005 Burcu Yildiz
    Contact: burcu.yildiz@gmail.com
    
    This file is part of pdf2table.
*/

package pdf2xml;

import java.lang.*;
import java.util.*;

public class Text_Element {
	
String value;
int top;
int left;
int width;
int height;
int right;
int font;
String format = "";
String typ;
int count_lines;
Vector elements;
int last_top; 
int first_top; 
int colspan = 1;
boolean artificial;

  public Text_Element(String v,int t,int l,int w,int h,int f,String f2,String t2) {
  	this.value = v;
  	this.top = t;
  	this.left = l;
  	this.width = w;
	this.right = l+w;
  	this.height = h;
  	this.font = f;  
  	this.format = f2;	
  	this.typ = t2;
    this.last_top = t; // no line merged to this text element
    this.first_top = t;
    this.colspan = 1;
    this.count_lines = 1;
    this.elements = new Vector();
    this.right = this.left + this.width;
    this.artificial = false;
  }	
  
  public Text_Element() {  	
  	this.value = "null";
    this.colspan = 1;  	
    this.count_lines = 1;
    this.artificial = true;
  }

  public Text_Element(String s) {
  	this.value = s;
    this.colspan = 1;  	
    this.count_lines = 1;
    this.artificial = false;
  }  
  
  public Object clone() {
  	Text_Element t = new Text_Element(this.value,this.top, this.left, this.width, this.height, this.font, this.format, this.typ);
  	return t;
  }
}