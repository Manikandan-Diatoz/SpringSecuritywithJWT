package com.secure.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.secure.demo.model.MyUserDetail;
import com.secure.demo.model.User;
import com.secure.demo.repository.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService{

	
	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user=userRepository.findByUsername(username);
		user.orElseThrow(()-> new UsernameNotFoundException("not found" +username));
		return user.map(MyUserDetail::new).get();
	}
	@PreAuthorize("authenticated")
    public String sayHelloSecured() {
        return "Hello user.";
    }
}
