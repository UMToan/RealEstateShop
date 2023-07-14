package BdsShop.Service.User;

import org.springframework.stereotype.Service;

import BdsShop.Dto.PaginatesDto;
@Service
public class PaginatesServiceImpl {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage) {
		PaginatesDto paginate = new PaginatesDto();
		paginate.setLimit(limit);		
		paginate.setTotalPage(SetInfoTotalPage(totalData, limit));
		paginate.setCurrentPage(CheckCurrentPage(currentPage,paginate.getTotalPage()));
		int start = FindStart(paginate.getCurrentPage(), limit);
		paginate.setStart(start);
		int end = FindEnd(paginate.getStart(), limit, totalData);
		paginate.setEnd(end);
		return paginate;
	}

	private int FindEnd(int start, int limit, int totalData) {//tìm vị trí đầu
		
		return start + limit > totalData ? totalData : (start + limit) - 1;
	}

	private int FindStart(int currentPage, int limit) {//tìm vị trí cuối
		return ((currentPage - 1) * limit) + 1;
	}

	private int SetInfoTotalPage(int totalData, int limit) {
		int totalPage = 0;
		totalPage = totalData / limit; //tổng spham(20sp) / giới hạn spham của 1 trang(5spham)
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
		//nếu chia ra 4 * limit == tổng spham trả về số trang
		//nếu chia ra 3 * limit < tổng spham trả về số trang + 1
		return totalPage;
	}
	
	public int CheckCurrentPage(int currentPage, int totalPage) {
		if(currentPage < 1) {	//nếu người dùng muốn tới trang < 1
			return 1;			//trả về trang hiện tại
		}
		if(currentPage > totalPage) { //nếu currentPage(trang hiện tại) lớn hơn totalPage(số trang)
			return totalPage;	//trả về trang cuối cùng
		}
		return currentPage;	//trả về trang hiện tại
	}
}
