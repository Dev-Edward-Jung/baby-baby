package com.app.babybaby.service.member.follow;

import com.app.babybaby.entity.member.Follow;
import com.app.babybaby.entity.member.Member;
import com.app.babybaby.repository.member.follow.FollowRepository;
import com.app.babybaby.repository.member.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

@Service
@RequiredArgsConstructor
@Qualifier("follow") @Primary
@Slf4j
public class FollowServiceImpl implements FollowService {

    private final FollowRepository followRepository;

    private final MemberRepository memberRepository;

    @Override
    public void saveFollow(Long followerId, Long followingId) {
        Member follower = memberRepository.findById(followerId).get();
        Member following = memberRepository.findById(followingId).get();
        Follow follow1 = new Follow(follower, following);
        followRepository.save(follow1);
    }

    @Override @Transactional
    public void deleteFollow(Long followingId, Long followerId) {
        Member follower = memberRepository.findById(followerId).get();
        Member following = memberRepository.findById(followingId).get();
        followRepository.deleteFollowByFollowerAndFollowing(follower, following);
    }
}
