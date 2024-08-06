package in.co.rays.project_3.model;

import java.util.List;

import in.co.rays.project_3.dto.EmpDto;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;

public interface EmpModelInt {
	public long add(EmpDto dto)throws ApplicationException,DuplicateRecordException;
	public void delete(EmpDto dto)throws ApplicationException;
	public void update(EmpDto dto)throws ApplicationException,DuplicateRecordException;
	public List list()throws ApplicationException;
	public List list(int pageNo,int pageSize)throws ApplicationException;
	public List search(EmpDto dto)throws ApplicationException;
	public List search(EmpDto dto,int pageNo,int pageSize)throws ApplicationException;
	public EmpDto findByPK(long pk)throws ApplicationException;
	public EmpDto findByName(String name)throws ApplicationException;


}
