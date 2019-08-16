up:
	docker-compose up -d
start:
	docker-compose start
stop:
	docker-compose stop

shell_invention:
	docker exec -ti invention /bin/bash -c "cd sites/Invention && python3 manage.py shell"

collectstatic_invention:
	docker exec -ti invention /bin/bash -c "cd sites/Invention && python3 manage.py collectstatic"

makemigrations_invention:
	docker exec -ti invention /bin/bash -c "cd sites/Invention && python3 manage.py makemigrations"

migrate_invention:
	docker exec -ti invention /bin/bash -c "cd sites/Invention && python3 manage.py migrate"

