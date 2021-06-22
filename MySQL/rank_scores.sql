SELECT s.Score, COUNT(t.Score) AS `Rank` FROM
(SELECT DISTINCT Score FROM Scores) AS t, Scores AS s
WHERE s.Score <= t.Score
GROUP BY s.Id, s.Score
ORDER BY s.Score DESC;