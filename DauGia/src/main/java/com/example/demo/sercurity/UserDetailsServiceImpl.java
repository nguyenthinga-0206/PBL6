package com.example.demo.sercurity;

import com.example.demo.model.TaiKhoan;
import com.example.demo.repository.nguoi_dung.TaiKhoanQuyenRepo;
import com.example.demo.repository.nguoi_dung.TaiKhoanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

//import vn.codegym.model.bean.User;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TaiKhoanRepo taiKhoanRepo;

    @Autowired
    private TaiKhoanQuyenRepo taiKhoanQuyenRepo;


    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {

        TaiKhoan taiKhoan = this.taiKhoanRepo.findByTaiKhoan(account);


        if (taiKhoan == null) {
            System.out.println("User not found! " + account);
            throw new UsernameNotFoundException("User " + account + " was not found in the database");
        }
//        System.out.println("Found user:! " + account);
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        Set<Role> roles = user.getRoles();
//        for (Role role : roles) {
//                // ROLE_USER, ROLE_ADMIN,..
//                GrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
//            grantedAuthorities.add(authority);
//            }
//
//        return new User(user.getUserName(), user.getPassword(), grantedAuthorities);

        return new MyUserDetails(taiKhoan);
    }

}
