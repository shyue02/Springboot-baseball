<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<input id="playername" type="text" class="form-control" placeholder="Enter playername">
		</div>
		<div class="mb-3">
			<input id="teamname" type="text" class="form-control" placeholder="Enter teamname">
		</div>
		<div class="mb-3">
			<input id="uniformnumber" type="text" class="form-control" placeholder="Enter uniformnumber">
		</div>
		<div class="mb-3">
			<input id="POSITION" type="text" class="form-control" placeholder="Enter POSITION">
		</div>
		<button type="submit" class="btn btn-primary">등록</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp"%>

