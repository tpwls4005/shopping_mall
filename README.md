#[기본 기능]
 ###제품 관리
1. 제품 등록, 수정, 삭제 기능

- 제품 등록
: 양식에 맞춰 제품 정보를 입력하여 등록할 수 있습니다.
필수 정보로는 제품명, 가격, 설명 등이 있을 수 있습니다.
제품 이미지 업로드를 통해 시각적인 정보도 등록 가능합니다.

-제품 수정
: 등록된 제품 정보를 양식에 맞춰 수정할 수 있습니다.
변경 가능한 정보로는 제품명, 가격, 설명, 이미지 등이 있을 수 있습니다.

-제품 삭제
: 등록된 제품을 삭제할 수 있습니다.
삭제 시 연관된 정보(주문, 리뷰 등)에 대한 처리도 고려해야 합니다.

2. 제품 이미지 업로드 및 관리

- 이미지 업로드
: 제품 등록 시 제품 이미지를 업로드할 수 있습니다.
이미지 업로드 시 적절한 저장 및 관리가 필요합니다.
   
###주문 처리
3. 장바구니 기능

- 장바구니 담기
: 로그인한 사용자는 제품을 장바구니에 담을 수 있습니다.
장바구니에 담긴 제품은 주문 이전에 확인 및 수정이 가능합니다.

4. 주문 생성, 취소, 결제 기능

-주문 생성
: 장바구니에 담긴 제품들로 주문을 생성할 수 있습니다.
주문 생성 시에는 주문 상태, 총 주문 금액 등의 정보가 저장됩니다.

- 주문 취소
:주문한 제품 중 일부 또는 전체를 취소할 수 있습니다.
취소 시에는 주문 상태 및 결제 상태를 업데이트합니다.

- 결제
: 다양한 결제 수단(신용카드, 계좌이체, 페이 등)을 지원합니다.
결제가 완료되면 주문 상태가 업데이트됩니다.

###사용자 관리
5. 회원 가입, 로그인, 로그아웃 기능:
   
- 회원 가입
: 아이디, 비밀번호, 이메일 등을 이용해 회원 가입을 할 수 있습니다.
아이디의 중복 여부를 확인하여 가입할 수 있습니다. 

- 로그인
:가입한 계정으로 로그인할 수 있습니다.
로그인 상태를 유지하기 위한 세션 처리가 필요합니다.

- 로그아웃
: 로그인한 상태에서 로그아웃할 수 있습니다.

6. 주문 내역 조회

- 주문 내역 확인
:로그인한 사용자는 자신의 주문 내역을 조회할 수 있습니다.
주문 내역에는 주문일, 주문 상태, 결제 상태 등이 포함됩니다.
   
#[추가 기능]
7. 검색 기능 구현 
- Elasticsearch 도입
: 제품 검색을 위해 Elasticsearch를 도입하여 성능과 정확도를 향상시킵니다.
- 
8. 비동기 처리
- 이메일 알림
: 주문 완료 후 이메일 알림을 비동기로 처리하여 사용자에게 효율적으로 알립니다.

9. 결제 시스템
- 다양한 결제 수단
: 신용카드, 계좌이체, 페이 등 다양한 결제 수단을 지원합니다.
결제 완료 후 주문 상태가 업데이트됩니다.

10. 배송 관리
- 배송 주소 등록 및 수정
:주문 후 배송 주소를 등록하고 필요에 따라 수정할 수 있습니다.
배송 상태를 추적하고 알림 기능을 추가합니다.
- 
11. 리뷰 및 평가
    
- 제품 리뷰 작성 및 조회
: 제품에 대한 리뷰를 작성하고 조회할 수 있습니다.
다른 사용자의 리뷰를 통해 제품에 대한 평가를 확인할 수 있습니다.

- 구매자 평가 추가
: 사용자는 구매 경험에 대한 평가를 추가할 수 있다.
