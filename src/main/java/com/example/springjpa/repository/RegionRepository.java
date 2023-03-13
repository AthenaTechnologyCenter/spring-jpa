package com.example.springjpa.repository;

import com.example.springjpa.model.entity.Region;
import com.example.springjpa.model.response.ProvinceResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
    List<Region> findAllByNameContains(String name);

    List<Region> getAllByCodeNameContains(String code);

    Integer countAllByCodeNameEnContains(String codeNameEn);

    Boolean existsAllByCodeNameEnContains(String codeNameEn);

    // Cách 1: Native query sử dụng model để bọc dữ liệu trả về
    @Query(value = "select * from administrative_regions where code_name like '%' :codeName", nativeQuery = true)
    List<Region> findRegionCustomize(@Param("codeName") String codeName);

    @Query("select r from administrative_regions as r where r.codeName like %:codeName% ")
    List<Region> findRegionCustomize2(@Param("codeName") String codeName);

    // cach su dung join nhieu bang lai voi nhau

    @Query(value = "select new com.example.springjpa.model.response.ProvinceResponse(p.code, p.name, p.nameEn, p.codeName, p.fullName, p.fullNameEn, ar.name) " +
            "from provinces as p join administrative_regions as ar on p.regionId = ar.id")
    List<ProvinceResponse> getAllProvinceWithRegion();

}
