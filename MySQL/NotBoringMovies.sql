SELECT c.id, c.movie, c.description, c.rating
FROM Cinema AS c
WHERE MOD(id, 2) <> 0
AND description <> "boring"
ORDER BY c.rating DESC;