package metaint.replanet.rest.reviews.repository;


import metaint.replanet.rest.reviews.entity.ReviewComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewCommentRepository extends JpaRepository<ReviewComment, Long> {

    List<ReviewComment> findByReviewCode(Long reviewCode);

    List<ReviewComment> findAllByReviewCode(Long reviewCode);

    void deleteByReviewCode(Long reviewCode);

    //@Query(value = "")
    void updateRevCommentMonitorized(Long revCommentCode);
}
