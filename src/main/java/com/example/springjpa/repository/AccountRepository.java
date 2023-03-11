//package com.example.springjpa.repository;
//
//import com.example.springjpa.model.entity.Account;
//import com.example.springjpa.model.response.AccountProfileResponse;
//import com.example.springjpa.model.response.AccountResponse;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface AccountRepository extends JpaRepository<Account, Long> {
//
//    // Các phổ thông
//    Optional<Account> findByUsernameAndPassword(String username, String password);
//
//    Optional<Account> findAccountByUsername(String username);
//
//    List<Account> findAll();
//
//    // Cách 1: Native query sử dụng model để bọc dữ liệu trả về
//    @Query(value = "select * from account a where" +
//            " a.username = :username " +
//            "and a.name = :name", nativeQuery = true)
//    Account findCustomizeAccount(@Param("username") String username,
//                                 @Param("name") String name);
//
//    // cách 2: JPQL sử dụng model để bọc dữ liệu trả về tuy nhiên, dữ liệu chỗ này
//    // linh động hơn, tuỳ biến qua Constructor
//    @Query("select new " +
//            "com.example.springjpa.model.entity.Account(" +
//            "a.id, a.username, a.password, a.profileId, a.name" +
//            ") " +
//            "from Account as a where a.username = :username " +
//            "and a.name = :name")
//    Account findCustomizeAccountSecond(@Param("username") String username,
//                                       @Param("name") String name);
//
//
//    // Cách 3: JPQL sử dụng model để bọc dữ liệu trả về
//    @Query("select a " +
//            "from Account as a where a.username = :username " +
//            "and a.name = :name")
//    Account findCustomizeAccountThird(@Param("username") String username,
//                                      @Param("name") String name);
//
//
//    // cách 4: Projection Sử dụng interface để bọc dữ liệu trả về
//    @Query("select a " +
//            "from Account as a where a.username = :username " +
//            "and a.name = :name")
//    AccountResponse findCustomizeAccount4th(@Param("username") String username,
//                                            @Param("name") String name);
//
//
//    @Query("select a.id as id, a.username as username, a.name as name, " +
//            " p.phone as phone, p.address as address, p.avatar as avatar, " +
//            " p.birthday as birthday " +
//            "from Account as a join Profile  as p on a.profileId = p.id " +
//            "where a.username = :username and a.password = :password")
//    AccountProfileResponse findAccountProfile(@Param("username") String username,
//                                              @Param("password") String password);
//}
