package com.collaboration.service;

import java.util.List;

import com.collaboration.model.BlogComment;
import com.collaboration.model.BlogPost;

public interface BlogPostService {

	
	public boolean createBlogPost(BlogPost post);
	List<BlogPost> list(int approved);
	public List<BlogPost> findLatest5Post();
	public BlogPost findPostById(int id);
	void updateBlogPost(BlogPost blogPost);
	public void deleteById(int id);
	List<BlogComment> getBlogComments(int blogId);
	void addBlogComment(BlogComment blogComment);
	
}