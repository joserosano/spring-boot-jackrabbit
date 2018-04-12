package com.jose.springbootjackrabbit.service;

import org.apache.jackrabbit.core.RepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

@Service
public class DocumentService {

    private Repository jcrRepository;
    private Session session;

    @Autowired
    public DocumentService(RepositoryImpl jcrRepository) throws Exception {
        this.jcrRepository = jcrRepository;
        session = jcrRepository.login(new SimpleCredentials("admin", "superSecret!".toCharArray()));
        try {
            String user = session.getUserID();
            String name = jcrRepository.getDescriptor(Repository.REP_NAME_DESC);
            System.out.println(
                    "Logged in as " + user + " to a " + name + " repository.");
        } finally {
            session.logout();
        }
    }

}
