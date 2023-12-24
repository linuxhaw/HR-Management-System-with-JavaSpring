package ems_aio.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ems_aio.dto.MPOS001;
import ems_aio.dto.MROL001;

//defining the business logic
@Service
public class RoleService {
	@Autowired
	RoleRepository RoleRepository;
//getting all books record by using the method findaAll() of	CrudRepository

	/*public List<MROL001> getAll() {
		List<MROL001> list = (List<MROL001>) RoleRepository.findAll();
		return list;
	}*/
	
//	public List<MROL001> getsearchrole(String id) {
//		 List<MROL001> list = (List<MROL001>) RoleRepository.findrole(id); 
//	 return list; }
	
	 public List<MROL001> getAll() {
		 List<MROL001> list = (List<MROL001>) RoleRepository.getvalid(); 
	 return list; }
	 
	
	//zay
	public MROL001 findLastID() {
		MROL001 list = RoleRepository.findLastID();
		return list;
	}
	

//getting a specific record by using the method findById() of	CrudRepository

	public Optional<MROL001> getRoleByCode(String code) {

		return RoleRepository.findById(code);

	}
	
//saving a specific record by using the method save() of	CrudRepository

	public void save(MROL001 roles) {
		RoleRepository.save(roles);
	}

//deleting a specific record by using the method deleteById() of CrudRepository

	public void delete(String code) {
		RoleRepository.deleteById(code);
	}

//updating a record
	public void update(MROL001 books, String Code) {
		RoleRepository.save(books);
	}
//	Hlwann
//	pagi_service with findAll method
	public Page<MROL001>rolePagi(String cname,	int PageNo,int PageSize){
		Pageable pageable=PageRequest.of(PageNo-1, PageSize);
		return this.RoleRepository.findAll(cname,pageable);
		
	}
	public Page<MROL001>rolePagiQuery(int PageNo,int PageSize){
		Pageable pageable=PageRequest.of(PageNo-1, PageSize);
		return this.RoleRepository.findQuery(pageable);
		
	}
}