package com.care.project.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.care.project.main.dto.ReviewDTO;
import com.care.project.main.dto.ReviewReserveDTO;
import com.care.project.main.dto.ReviewSearchDTO;

public interface ReviewMapper {
	public List<ReviewSearchDTO> getList(@Param("id") String id);
	public List<ReviewDTO> searchInfo(int id);
	public List<ReviewDTO> getInfo(@Param("id") String id, @Param("start") int start);
	public int getCount(String id);
	public int writeReview(ReviewDTO dto);
	public List<ReviewReserveDTO> getReserve(@Param("id") String id,@Param("start") int start);
	public int getReserveCount(String id);
	public int delReserve(int id);
}