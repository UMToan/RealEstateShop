package BdsShop.Service.User;

import org.springframework.stereotype.Service;

import BdsShop.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage);
}
