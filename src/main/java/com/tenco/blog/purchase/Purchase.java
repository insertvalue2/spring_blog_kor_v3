package com.tenco.blog.purchase;

/**
 * 구매 내역 엔티티
 *
 * User 와 Board 의 구매 이력 관계를 표현 함
 *
 * 한 사람에 사용자는 여러 게시글을 구매할 수 있다. (o)
 * 한 게시글을 여러 사용자에게 구매 될 수 있다. (o)
 * User : Board - 다대다 관계로 표현이 되기 때문게 중간 테이블 (Purchase) 생성이 되어야 한다
 *
 */
public class Purchase {

}
